package ex02;
class Max {
    private int n1,n2;
    public Max(int a,int b){
        n1 = a;
        n2 = b;
    }
    public int compare(){
        if(n1>=n2){
            return n1;
        }
        else
            return n2;
    }
}
