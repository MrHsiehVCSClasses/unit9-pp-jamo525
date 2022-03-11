package u9pp.Chess;

public class Knight extends ChessPiece
{
  private int row;
  private int col;
  public Knight (ChessPiece[][] board, int row, int col, boolean isWhite)
  {
    super(board, row, col, isWhite);
    this.row = row;
    this.col = col;
  }

  public boolean canMoveTo(int row, int col)
  {
    int rowDiff = Math.abs(this.row - row);
    int colDiff = Math.abs(this.col - col);

    if (!((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)))
      return false;
    return super.canMoveTo(row, col);
  }
  
  public String toString()
  {
    if (this.isWhite())
      return "N";
    return "n";
  }
}