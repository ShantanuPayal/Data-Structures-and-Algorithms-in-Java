
import java.util.Scanner;

public class PostFixEvaluation {

	int stack[], tos, MaxSize;

	void createStack(int size) {
		stack = new int[size];
		MaxSize = size;
		tos = -1;
	}

	void push(int e) {
		tos++;
		stack[tos] = e;
		// or stack[++tos]=e;
	}

	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);
	}

	int peek() {
		return (stack[tos]);
	}

	boolean is_full() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	boolean is_empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	void print_stack() {
		for (int i = tos; i > -1; i--)
			System.out.println(stack[i]);
	}

	private static boolean isOperator(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }

    public static int postEvaluation(String s) {
        PostFixEvaluation obj = new PostFixEvaluation();
        obj.createStack(s.length());

        String[] tokens = s.split("\\s+"); // Split by spaces

        for (String token : tokens) {
            if (!isOperator(token)) {
                int a = Integer.parseInt(token);
                obj.push(a);
            } else {
                int ch2 = obj.pop();
                int ch1 = obj.pop();

                switch (token) {
                    case "+":
                        obj.push(ch1 + ch2);
                        break;
                    case "-":
                        obj.push(ch1 - ch2);
                        break;
                    case "*":
                        obj.push(ch1 * ch2);
                        break;
                    case "/":
                        obj.push(ch1 / ch2);
                        break;
                }
            }
        }
        return obj.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression : ");
        String input = sc.nextLine(); // Read entire line
        int output = postEvaluation(input);
        System.out.println("Result: " + output);
    }
}