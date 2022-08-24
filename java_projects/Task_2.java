package java_projects;


// Учитывая целочисленный массив nums и целое число val, удалите все вхождения val in nums in-place. 
// Относительный порядок элементов может быть изменен.

public class Task_2 {

  public static void main(String[] args) {
    int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
    int val = 2;

    int i = 0, j = 0;
    while (j < nums.length) {
      if (nums[j] == val) {
        j++;
      } else {
        nums[i] = nums[j];
        i++;
        j++;
      }
    }
    System.out.println(i);
  }
}
