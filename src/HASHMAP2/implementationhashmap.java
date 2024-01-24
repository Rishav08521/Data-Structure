package HASHMAP2;

import linkedlist.singlelinklist;

import java.util.*;

//public class implementationhashmap {
//    static class myHashMap<k,v>{
//        public static final int DEFAULT_CAPACITY=4;
//        //public static final float DEFAULT_LOAD_FACTOR=0.75f;

//        private class Node{
//            k key;
//            v value;
//            Node(k key,v value){
//                this.key=key;
//                this.value=value;
//            }
      //  }
       // private int n;
//        private Linkedlist<Node>[] buckets;
//        private void initbuckets(int N){
//            buckets=new Linkedlist[n];
//            for (int i=0;i<buckets.length;i++){
//                buckets[i]=new Linkedlist<>();
//            }
//
//        }
//        private int hasfun(k key){
//           int hc= key.hashCode();
//           return (Math.abs(hc)) % buckets.length;
//        }
//        private int searchInbucket(LinkedList<Node>ll, k key){
//            for (int i=0;i<ll.size();i++){
//                if (ll.get(i).key==key){
//                   return i;
//                }
//            }
//            return -1;
//        }
//        public myHashMap(){
//         initbuckets(DEFAULT_CAPACITY);
//        }
//        public int size(){  // return the number of  entery on map
//            return n;
//
//        }
//        public void put(k key, v value){
//            int bi=hasfun( key);
//            LinkedList <Node > currbucket=buckets[bi];
//            int ei=searchInbucket(currbucket,key);
//            if (ei!=-1){
//                Node node=new Node(key, value);
//                currbucket.add(node);
//            }

//        }
//        public v get(k key){
//
//        }
//        public v remove(k key){
//
//        }
//    }
//    public static void main(String[] args) {
//        myHashMap<Integer,Integer> in=new myHashMap<>();
//        myHashMap <String, Integer>sn=new myHashMap();
//
//    }
//}
