package u9pp.Chess;

public class King extends ChessPiece
{
  private int row;
  private int col;
  private ChessPiece[][] board;
  public King (ChessPiece[][] board, int row, int col, boolean isWhite)
  {
    super(board, row, col, isWhite);
    this.row = row;
    this.col = col;
    this.board = board;
  }

  public boolean canMoveTo(int row, int col)
  {
    if (Math.abs(this.row - row) > 1 || Math.abs(this.col - col) > 1)
      return false;
    else
    {
      for (int r = row - 1; r <= row + 1; r++)
      {
        for (int c = col - 1; c <= col + 1; c++)
        {
          if (super.canMoveTo(r,c))
          {
            if (board[r][c] instanceof King)
            {
              return false;
            }
          }
        }
      }
    }
    return super.canMoveTo(row, col) && (this.canMoveHorizontal(row, col) || this.canMoveVertical(row, col) || this.canMoveDiagonal(row, col));
  }

  public String toString()
  {
    if (this.isWhite())
      return "K";
    return "k";
  }
}
