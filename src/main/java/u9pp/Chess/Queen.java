package u9pp.Chess;

public class Queen extends ChessPiece
{
  public Queen (ChessPiece[][] board, int row, int col, boolean isWhite)
  {
    super(board, row, col, isWhite);
  }

  public boolean canMoveTo(int row, int col)
  {
    return super.canMoveTo(row, col) && (this.canMoveHorizontal(row, col) || this.canMoveVertical(row, col) || this.canMoveDiagonal(row, col));
  }
  public String toString()
  {
    if(this.isWhite())
      return "Q";
    return "q";
  }
}