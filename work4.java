    public class work4{ 
     public static void count(String str){
        char[] chars = str.toCharArray();
       HashMap<Character,Integer> hm = new HashMap();
        for(char c : chars){
             if(!hm.containsKey(c)){
            hm.put(c,1);
          }else{ 
            hm.put(c, hm.get(c)+1);
            }
        /*  hm.put(c,hm.containsKey(c) ? hm.get(c)+1:1);*/
        }


        for(Character key: hm.keySet()){
            System.out.println(key + "====" + hm.get(key));
        }
    }

    public static void main(String[] args) {
         String str = "abcaaaefdabbhg";
        count(str);
    }
    }