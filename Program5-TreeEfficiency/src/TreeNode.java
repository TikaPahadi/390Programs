public class TreeNode {
	public int data;
	public TreeNode left,right;
	public int freq;
	
	public TreeNode(){
		
	}
	
	public TreeNode(int num){
		this.data = num;
	}
	
	public TreeNode makeNode(int data){
		this.data = data;
		return this;
	}

}
