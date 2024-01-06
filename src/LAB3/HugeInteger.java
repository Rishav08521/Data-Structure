package LAB3;

public class HugeInteger {
    private static final int DIGIT_SIZE = 40;
    private int[] digit = new int[DIGIT_SIZE];

    public static void main(String[] args)
    {
        HugeInteger test = new HugeInteger();
        System.out.println(test);
        HugeInteger test2 = new HugeInteger(34500);
        System.out.println(test2);
        HugeInteger test3 = new HugeInteger("54702");
        System.out.println(test3);
        HugeInteger addTest = add(test2, test3);
        System.out.println(addTest);
        HugeInteger subTest = subtract(test3, test2);   //Positive
        System.out.println(subTest);
        HugeInteger subTest2 = subtract(new HugeInteger("10020"), new HugeInteger("36"));   //Borrow
        System.out.println(subTest2);
        //Compare test
        //test2 = 34500, test3 = 54702, theSame = 34500
        HugeInteger theSame = new HugeInteger("34500");
        System.out.println(test2.isEqualTo(test3));
        System.out.println(test2.isEqualTo(theSame));
        System.out.println(test2.isNotEqualTo(test3));
        System.out.println(test2.isNotEqualTo(theSame));

        System.out.println(test3.isGreaterThan(test2));

        System.out.println(test2.isLessThan(test3));
        System.out.println(test2.isGreaterThanOrEqualTo(test3));

        System.out.println(test2.isLessThanOrEqualTo(theSame));
        System.out.println(test2.isLessThanOrEqualTo(test3));
        System.out.println(test3.isLessThanOrEqualTo(test2));

        System.out.println(test2.isZero());
        System.out.println(test.isZero());

        //Multiply
        HugeInteger mul_a,mul_b;
        mul_a = new HugeInteger(45871);
        mul_b = new HugeInteger(98547);
        System.out.println(multiply(mul_a,mul_b));

        //Divide and remainder
        HugeInteger div_a, div_b;
        div_a = new HugeInteger(3000);
        div_b = new HugeInteger(72);
        System.out.println(divide(div_a,div_b));
        System.out.println(remainder(div_a,div_b));
    }

    //Constructor Area
    //Default constructor
    public HugeInteger()
    {
        for (int i=0; i<DIGIT_SIZE; i++)
            digit[i]=0;
    }
    //Integer constructor
    public HugeInteger(final int initValue)
    {
        int a = initValue, digitIdx=0;
        while(a!=0) {
            digit[digitIdx++]=a%10;
            a/=10;
        }
    }
    //String constructor
    public HugeInteger(final String initStr)
    {
        parse(initStr);
    }
    //Int array constructor
    public HugeInteger(final int[] userSpecifyDigit)
    {
        for (int i=0;i<DIGIT_SIZE;i++)
            digit[i] = userSpecifyDigit[i];
    }


    //Assignment requirement.
    public void parse(final String inStr)
    {
        int myStrLen = inStr.length();
        for (int i=0, inStrIdx=myStrLen-1; inStrIdx>=0; i++, inStrIdx--) {
            digit[i] = inStr.charAt(inStrIdx) - '0';
        }
    }

    //Display
    //000000000 = 0, I also solve this display problem.
    public String toString()
    {
        String output = new String();
        boolean firstNonZero = false;

        for (int i=DIGIT_SIZE-1; i>=0; i--) {
            if (firstNonZero == false && i-1>=0 && digit[i-1]!=0) {
                firstNonZero=true;
                continue;
            }

            if (firstNonZero) {
                output += String.format("%d",digit[i]);
            }
        }
        if (output.isEmpty())
            output += "0";
        return output;
    }

    //Math computation method
    public static HugeInteger add(HugeInteger a, HugeInteger b)
    {
        int[] resultDigit = new int[DIGIT_SIZE];
        int[] carry = new int[DIGIT_SIZE];

        for (int i=0; i<DIGIT_SIZE; i++) {
            resultDigit[i]=a.digit[i]+b.digit[i]+carry[i];
            if (resultDigit[i]>=10) {
                if (i+1<DIGIT_SIZE)
                    carry[i+1]=1;
                else {
                    //overflow
                    //Throw the carry bit away.
                }
                resultDigit[i]-=10;
            }
        }

        return new HugeInteger(resultDigit);
    }

    public static HugeInteger subtract(HugeInteger a, HugeInteger b)
    {
        int[] resultDigit = new int[DIGIT_SIZE];
        int[] borrow = new int[DIGIT_SIZE];

        //Currently, not consider negative value and answer.
        for (int i=0;i<DIGIT_SIZE;i++) {
            resultDigit[i]=a.digit[i]-b.digit[i]-borrow[i];
            if (resultDigit[i]<0) {
                if (i+1<DIGIT_SIZE)
                    borrow[i+1]=1;
                else {
                    //overflow
                    //Throw the borrow bit away.
                }

                resultDigit[i]+=10;
            }
        }
        return new HugeInteger(resultDigit);
    }

    public static HugeInteger multiply(HugeInteger a, HugeInteger b)
    {
        //Note: a.digit[i] * b.digit[j] -> result will put in resultDigit[i+j]
        //Note: if a.digit[i]==0 -> Skip it. The result won't change.

        int[] resultDigit = new int[DIGIT_SIZE];
        int[] carry = new int[DIGIT_SIZE];

        //Loop for multiply
        for (int i=0;i<DIGIT_SIZE;i++) {
            if (a.digit[i]==0)
                continue;
            for (int j=0; j<DIGIT_SIZE && i+j<DIGIT_SIZE; j++) {
                resultDigit[i+j] += a.digit[i]*b.digit[j]+carry[i+j];
                carry[i+j]=0;

                if (resultDigit[i+j]>=10) {
                    if (i+j<DIGIT_SIZE)
                        carry[i+j+1]+=resultDigit[i+j]/10;
                    else {
                        //overflow
                        //Throw the carry bit away.
                    }
                    resultDigit[i+j]%=10;
                }
            }
        }
        return new HugeInteger(resultDigit);
    }

    public static HugeInteger divide(HugeInteger a, HugeInteger b)
    {
        for(int i=1;;i++) {
            HugeInteger coreNum = multiply(b,new HugeInteger(i));
            if(coreNum.isGreaterThanOrEqualTo(a))
                return new HugeInteger(i-1);
        }
    }

    public static HugeInteger remainder(HugeInteger a, HugeInteger b)
    {
        HugeInteger quotient = divide(a,b);
        return subtract(a, multiply(b, quotient));
    }

    //Compare method
    public boolean isEqualTo(HugeInteger a)
    {
        String selfStr = toString();
        String aStr = a.toString();

        return selfStr.equals(aStr);
    }
    public boolean isNotEqualTo(HugeInteger a)
    {
        return !isEqualTo(a);
    }
    public boolean isGreaterThan(HugeInteger a)
    {
        //Not consider negative value
        String selfStr = toString();
        String aStr = a.toString();

        if(isEqualTo(a))
            return false;

        /*if (negative found) {

        }*/
        if (selfStr.length() > aStr.length())
            return true;
        else if (selfStr.length() < aStr.length())
            return false;
        else {
            for (int i=0;i<selfStr.length();i++) {
                if(selfStr.charAt(i)>aStr.charAt(i))
                    return true;
                else if (selfStr.charAt(i)<aStr.charAt(i))
                    return false;
                else
                    continue;
            }
            //Here, means that they are equal
            return false;
        }
    }
    public boolean isLessThan(HugeInteger a)
    {
        //(!isGreaterThan)&&(isNotEqualTo)
        return (!isGreaterThan(a))&&(isNotEqualTo(a));
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger a)
    {
        return isGreaterThan(a)||isEqualTo(a);
    }
    public boolean isLessThanOrEqualTo(HugeInteger a)
    {
        return isLessThan(a)||isEqualTo(a);
    }
    public boolean isZero()
    {
        return isEqualTo(new HugeInteger(0));
    }
}
