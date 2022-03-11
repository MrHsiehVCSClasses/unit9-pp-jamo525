package u9pp.Chess;

public class Pawn extends ChessPiece
{
  private boolean hasMoved = false;
  private int row;
  private int col;
  private ChessPiece[][] board;
  public Pawn (ChessPiece[][] board, int row, int col, boolean isWhite)
  {
    super(board, row, col, isWhite);
    this.row = row;
    this.col = col;
    this.board = board;
  }

  public boolean canMoveTo(int row, int col)
  {
    if (!(super.canMoveTo(row, col) && this.canMoveVertical(row, col)))
        return false;
    else if (this.isWhite())
    {
      if (board[row][col] != null && board[row][col].isWhite() != board[this.row][this.col].isWhite() && this.row - row == 1 && Math.abs(this.col - col) == 1)
        return true;
      if (!(hasMoved) && (this.row - row == 1 || this.row - row == 2))
        return true;
      else if (hasMoved && this.row == 1)
        return true;
      else
        return false;
    }
    else
    {
      if (board[row][col] != null && board[row][col].isWhite() != board[this.row][this.col].isWhite() && row - this.row == 1 && Math.abs(this.col - col) == 1)
        return true;
      if (!(hasMoved) && (row - this.row == 1 || row - this.row == 2))
        return true;
      else if (hasMoved && this.row == 1)
        return true;
      else
        return false;
    }
  }

  public void doMove(int row, int col)
  {
    super.doMove(row, col);
    hasMoved = true;
  }
  public String toString()
  {
    if(this.isWhite())
      return "P";
    return "p";
  }
}