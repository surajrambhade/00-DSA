
class TrieNode {
  Boolean isEndOfWord;
  TrieNode children[];
  TrieNode() {
        isEndOfWord = false;
        children = new TrieNode[26]; //127 total asci value
    }

}

public class Trie {

  public static void insert(String word, TrieNode root) {
    // e.g word-> code
    int n = word.length();
    TrieNode workingNode = root;
    for (int i = 0; i < n; i++) {
      int index = word.charAt(i) - 'a';
      TrieNode temp;
      if (workingNode.children[index] == null) {
        temp = new TrieNode();
      } else {
        temp = workingNode.children[index];
      }
      workingNode.children[index] = temp;
      if (i == n - 1) {
        temp.isEndOfWord = true;
      }
      workingNode = temp;
    }
  }
  public static boolean search(String word, TrieNode root){
    // e.g searching for word app
    int n = word.length();
    TrieNode workingNode = root;
    for(int i=0;i<n;i++){
      int index = word.charAt(i) - 'a';
      if (workingNode.children[index] == null) {
        return false;
      }
      else{
        workingNode = workingNode.children[index];
      }
    }
    return workingNode.isEndOfWord;
  }
  public static void main(String[] args) {
    TrieNode root = new TrieNode();
    insert("code", root);
    System.out.println(root.children['c' - 'a'].isEndOfWord);
    System.out.println(root.children['c' - 'a']
    .children['o' - 'a']
    .children['d' - 'a']
    .children['e' - 'a']);
    System.out.println(root.children['c' - 'a']
    .children['o' - 'a']
    .children['d' - 'a']
    .children['e' - 'a'].isEndOfWord);
    //System.out.println(root.children['c' - 'a']);
    System.out.println("Searching the word " + search("code", root));
    insert("coding", root);
    System.out.println(search("coding", root));
  }
}
