import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong dãy Fibonacci: ");
        int n = scanner.nextInt();

        int[] fibonacciArray = generateFibonacciArray(n);

        System.out.println("Dãy Fibonacci với " + n + " phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }

    public static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray = new int[n]; //Dòng đầu tiên int[] fibonacciArr = new int[n]; tạo một mảng fibonacciArr với độ dài n, nơi mà chúng ta sẽ lưu trữ các số Fibonacci.
        /*Sau đó, với mỗi giá trị i từ 0 đến n - 1, chúng ta xây dựng dãy Fibonacci bằng cách thực hiện các bước sau:
        Nếu n lớn hơn hoặc bằng 1, gán fibonacciArr[0] bằng 0.
        Nếu n lớn hơn hoặc bằng 2, gán fibonacciArr[1] bằng 1.
        Từ i = 2 đến n - 1, ta tính toán mỗi số Fibonacci bằng tổng của hai số Fibonacci trước đó (fibonacciArr[i - 1] và fibonacciArr[i - 2]) và gán giá trị này vào fibonacciArr[i].
        Sau khi hoàn thành vòng lặp, mảng fibonacciArr chứa dãy Fibonacci với n số phần tử, và phương thức trả về mảng này.*/
        if (n >= 1) {
            fibonacciArray[0] = 0;
        }
        if (n >= 2) {
            fibonacciArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }
}

