public class Q733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int origin_color = image[sr][sc];
        flood(image, sr, sc, origin_color, color);
        return image;
    }

    private void flood(int[][] image, int x, int y, int origin_color, int color){
        if(x < 0 || y < 0) return;
        if(x >= image.length || y >= image[0].length) return;
        if(image[x][y] != origin_color) return;
        if(image[x][y] == color) return;

        image[x][y] = color;

        flood(image, x-1, y, origin_color, color);
        flood(image, x+1, y, origin_color, color);
        flood(image, x, y-1, origin_color, color);
        flood(image, x, y+1, origin_color, color);
    }
}
