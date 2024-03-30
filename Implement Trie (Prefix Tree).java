class Node{
    char data;
    boolean isTerminal;
    HashMap<Character,Node> hp;

    Node(char data, boolean isTerminal, HashMap<Character,Node> hp){
        this.data = data;
        this.isTerminal = isTerminal;
        this.hp = hp;
    }
}

class Trie {

    static Node root;
    public Trie() {
        root = new Node('.',false,new HashMap<>());
    }

    public void insert(String s) {
        int n = s.length();
        Node curr = root;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            HashMap<Character,Node> hp = curr.hp;
            if(hp.containsKey(ch)){
                curr = hp.get(ch);
            }else{
                Node x = new Node(ch,(i==n-1)?true:false,new HashMap<>());
                hp.put(ch,x);
                curr = x;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String s) {
        Node curr = root;
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            HashMap<Character,Node> hp = curr.hp;
            if(hp.containsKey(ch)){
                curr = hp.get(ch);
            }else{
                return false;
            }
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String s) {
        Node curr = root;
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            HashMap<Character,Node> hp = curr.hp;
            if(hp.containsKey(ch)){
                curr = hp.get(ch);
            }else{
                return false;
            }
        }
        return true;
    }
}