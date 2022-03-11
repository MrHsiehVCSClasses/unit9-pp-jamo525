package u9pp.Chess;


public class Rook extends ChessPiece
{
  public Rook (ChessPiece[][] board, int row, int col, boolean isWhite)
  {
    super(board, row, col, isWhite);
  }

  public boolean canMoveTo(int row, int col)
  {
    return super.canMoveTo(row, col) && (this.canMoveHorizontal(row, col) || this.canMoveVertical(row, col));
  }
  public String toString()
  {
    if (this.isWhite())
      return "R";
    return "r";
  }
}