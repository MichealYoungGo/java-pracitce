import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Gobang {
	private static int BOARD_SIZE = 15;
	private String[][] board;
	public void initBoard(){
		board = new String[BOARD_SIZE][BOARD_SIZE];
		for (var i = 0; i < BOARD_SIZE; i++){
			for (var j = 0; j < BOARD_SIZE; j++){
				board[i][j] = "+";
			}
		}
	}
	public void printBoard(){
		for (var i = 0; i < BOARD_SIZE; i++){
			for (var j = 0; j <BOARD_SIZE; j++){
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) throws Exception {
		var gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
		//获取键盘输入的方法
		var br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while ((inputStr = br.readLine()) != null){
			String[] posStrArr = inputStr.split(",");
			var xPos = Integer.parseInt(posStrArr[0]);
			var yPos = Integer.parseInt(posStrArr[1]);
			gb.board[yPos-1][xPos-1] = "●";
			gb.printBoard();
			System.out.println("请输入您的棋子坐标：");
		}		
		
	}
}	

