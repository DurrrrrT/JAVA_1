package java_projects;
import java.util.Arrays;

// Учитывая целочисленный массив фиксированной длины arr,
// продублируйте каждое вхождение нуля, сдвигая оставшиеся элементы вправо.
// Обратите внимание , что элементы, превышающие длину исходного массива, не записываются.
// Выполните указанные выше изменения во входном массиве на месте и ничего не возвращайте.

// Ввод: arr = [1,0,2,3,0,4,5,0]
// Вывод: [1,0,0,2,3,0,0,4]

public class Task_1 {

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
    int[] res = new int[arr.length];
    int j = 0;
    int i = 0;

    while (j <= arr.length - 1) {
      if (arr[i] != 0) {
        res[j] = arr[i];
      } else if (arr[i] == 0) {
        res[j] = 0;
        if (j <= arr.length - 2) {
          res[j + 1] = 0;
        }
        j++;
      }
      j++;
      i++;
    }
    for (int k = 0; k < arr.length; k++) {
      arr[k] = res[k];
    }
    System.out.println(Arrays.toString(res));
  }
}


