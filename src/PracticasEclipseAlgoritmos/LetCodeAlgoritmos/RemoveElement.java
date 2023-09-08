package PracticasEclipseAlgoritmos.LetCodeAlgoritmos;

public class RemoveElement {
    public static void main(String[] args) {
        //input ese array, y elimina el valor de val,y dice cuantos números hay eliminando el val, junto con el array sin todos los numeros existentes con valor val
        //Sin valor de retorno en metodo(void)
        solution(new int[] {0, 1, 2, 3, 5, 4, 4}, 4);
    }
    public static void solution(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println("k: " + k); // Output: 5
        System.out.print("nums: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " "); // Output: 0 1 2 3 5
        }
    }

    public class RemoveElement2version {
        public static void main(String[] args) {
            //Con valor de retorno int
            //input ese array, y elimina el valor de val,y dice cuantos números hay eliminando el val
            System.out.println(solution(new int[] {0, 1, 2, 3, 5, 4, 4}, 4));
        }
        public static int solution(int[] nums, int val) {
            int k = 0; // Number of elements not equal to val

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;  // Output: 5
        }

    }
}


