package kosa.dataa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackMission {

    public static void main(String[] args) {
        //Ű������� ���м����� �Է�
        //((2+3)+10) => ��ȣ ��ġ / ����ġ �Ǵ�
        Stack<String> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("���� ������ �Է� ���ּ��� : ");
        String expression = sc.nextLine();  // �Է��ϸ� stack���� ���� ����

        try {
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (c == '(') {
                    stack.push(c + "");
                } else if (c == ')') {
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("��ȣ�� ��ġ �մϴ�.");
            }
            else {
                System.out.println("��ȣ�� ����ġ �մϴ�.");
            }
        }catch (Exception e) {
            System.out.println("��ȣ�� ����ġ �մϴ�.");
        }
    }
}
