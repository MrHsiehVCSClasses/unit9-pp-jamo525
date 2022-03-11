package u9pp.Chess;

public class Bishop extends ChessPiece
{
  public Bishop (ChessPiece[][] board, int row, int col, boolean isWhite)
  {
    super(board, row, col, isWhite);
  }

  public boolean canMoveTo(int row, int col)
  {
    return super.canMoveTo(row, col) && this.canMoveDiagonal(row, col);
  }

  public String toString()
  {
    if (this.isWhite())
      return "B";
    return "b";
  }
}