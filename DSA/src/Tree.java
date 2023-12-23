class TNode {
    int data;
    TNode RChild;
    TNode LChild;

    public TNode(int data){
        this.data = data;
        this.LChild = null;
        this.RChild = null;
    }

    
}
public class Tree {
    TNode root;
    public Tree(){
        this.root = null;
    }

    public TNode insert(TNode node, int data){
        TNode newNode = new TNode(data);
        if(this.root == null){
            this.root = newNode;
            newNode.LChild = null;
            newNode.RChild = null;
        }else{
            if(data > node.data){
                node.RChild = insert(node.RChild, data);
            }
            else if(data < node.data){
                node.LChild = insert(node.LChild, data);
            }
        }
        return node;
    }


    public TNode search(TNode node, int key){
        if(node == null){
            System.out.println("Tree is empty");
            return null;
        }else{
            if(node.data == key){
                return root;
            }
            else if(node.data < key){
                return search(node.RChild, key);
            }
            else{
                return search(node.LChild, key);
            }
        }
    }
}
