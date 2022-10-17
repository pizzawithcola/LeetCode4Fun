import java.util.LinkedList;
import java.util.List;

public class Q589 {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> ans = new LinkedList<Integer>();
        addNode(root, ans);
        return ans;

    }

    void addNode(Node root, LinkedList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        for(int i = 0; i < root.children.size(); i++){
            addNode(root.children.get(i), ans);
        }
    }
}
