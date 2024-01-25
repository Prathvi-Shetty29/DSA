import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode{
    static class HashMap<K,V>{ //generics
        private class Node{
            K key;
            V value;

            public Node (K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private  int N;
        private LinkedList<Node> buckets[];


        @SuppressWarnings("unchecked")
        public HashMap(){
            this.n=4;
            this.buckets=new LinkedList[4];
            for (int i=0;i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }


        }
        private  int hashFunction(K Key){

        }

        public void put(K key, V value){
            int bi=hashFunction(key);

            int di = searchInLL(key,bi);
            if(di ==-1){
                buckets[i].add(new Node(Key,value))
            }
        }

    }
    
}
