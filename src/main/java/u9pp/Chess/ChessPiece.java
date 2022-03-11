package u9pp.Chess;

public abstract class ChessPiece
{
  private ChessPiece[][] board;
  private int row;
  private int col;
  private boolean isWhite;
  
  public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite)
  {
      this.board = board;
      this.row = row;
      this.col = col;
      this.isWhite = isWhite;
  }

  public boolean canMoveTo(int row, int col)
  {
      if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || (this.row == row && this.col == col) || !(board[row][col] == null || board[this.row][this.col].isWhite != board[row][col].isWhite))
      {
        return false;
      }
      return true;
  }
  
  public void doMove(int row, int col)
  {
     board[row][col] = this;
     board[this.row][this.col] = null;
     this.row = row;
     this.col = col;
  }

  public boolean isWhite()
  {
    return isWhite;
  }

  public abstract String toString();

  public boolean canMoveVertical (int row, int col)
  {
    if (this.col != col)
      return false;
    else if (this.row < row)
    {
      for (int i = this.row + 1; i < row; i++)
      {
        if (this.board[i][col] != null)
        {
          return false;
        }
      }
    }
    else
    {
      for (int i = this.row - 1; i > row; i--)
      {
        if (this.board[i][col] != null)
        {
          return false;
        }
      }
    }
    return true;
  }

  public boolean canMoveHorizontal (int row, int col)
  {
    if (this.row != row)
      return false;
    else if (this.col < col)
    {
      for (int i = this.col + 1; i < col; i++)
      {
        if (this.board[row][i] != null)
        {
          return false;
        }
      }
    }
    else
    {
      for (int i = this.col - 1; i > col; i--)
      {
        if (this.board[row][i] != null)
        {
          return false;
        }
      }
    }
    return true;
  }

  public boolean canMoveDiagonal (int row, int col)
  {
    if (Math.abs(row - this.row) != Math.abs(col - this.col))
      return false;
    else if (this.row < row && this.col < col)
    {
      for (int i = this.row + 1; i < row; i++)
      {
          if (board[i][i] != null)
          {
            return false;
          }
      }
    }
    else if (this.row > row && this.col > col)
    {
      for (int i = this.row - 1; i > row; i--)
      {
        if (this.board[i][i] != null)
        {
          return false;
        }
      }
    }
    else if (this.row < row && this.col > col)
    {
      for (int i = this.row + 1; i < row; i ++)
      {
        if (this.board[i][col - i + row] != null)
        {
          return false;
        }
      }
    }
    else
    {
      for (int i = this.row - 1; i > row; i --)
      {
        if (this.board[row - i + col][i] != null)
        {
          return false;
        }
      }
    }
    return true;
  }
}