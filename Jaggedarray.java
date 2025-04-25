public class Jaggedarray {
    public static void main(String[] args) {
        // internal arrays can have differnt sizes . we need to sppecify how many arrays
        // thats all.
        int nums[][] = new int[3][]; // jagged
        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    // output
    /*
     * 86 82 57
     * 89 75
     * 44 51 32
     */

}
