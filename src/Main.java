import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int Num = sc.nextInt();
        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                int A = Math.abs(a);
                int B = Math.abs(b);
                if(A>B)
                    return A-B;

                else if(A == B){
                    if(a>b) return 1;
                    else return -1;
                }

                else
                    return -1;
            }
        });

        for(int i = 0; i < Num; i++) {

            int num = sc.nextInt();

            if(num == 0) {
                sb.append(que.size() == 0 ? 0 : que.poll()).append("\n");
            }
            else {
                que.add(num);
            }
        }

        System.out.print(sb);

    }

}