package lec19;

public class Queen_combination
{
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean [] board = new boolean[n];
        Printanswer(board,tq,0,"",0);
    }
    public static void Printanswer(boolean[]board,int tq,int qpsf,String ans, int idx)
    {
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length ; i++) {
            if (board[i]==false)
            {
                board[i]=true;
                Printanswer(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false;
            }
        }
    }
}
/*
b0q0b1q1
b0q0b2q1
b0q0b3q1

b1q0b2q1
b1q0b3q1

b2q0b3q1

 */