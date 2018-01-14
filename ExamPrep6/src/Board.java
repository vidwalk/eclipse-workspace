
public class Board
{
   private Field[][] fields;

   public Board(int rows, int cols)
   {
      fields = new Field[rows][cols];
   }

   public void setPiece(int row, int col, Piece piece)
   {
      fields[row][col].setPiece(piece);
   }

   public void removePiece(int row, int col)
   {
      fields[row][col] = null;
   }

   public void movePiece(int fromRow, int fromCol, int toRow, int toCol)
   {
      fields[toRow][toCol].setPiece(fields[fromRow][fromCol].getPiece());
   }

   public Piece show(int row, int col)
   {
      return fields[row][col].getPiece();
   }

   public boolean isEmpy(int row, int col)
   {
      if(fields[row][col].getPiece()== null)
         return true;
      return false;
   }

   public String toString()
   {
      String result = "";
      for(int i = 0 ; i <= fields.length ; i++)
         {for(int j = 0 ; j<= fields[0].length ; i++)
            result = result + fields[i][j] + " ";
      result = result + "%n";
         }
      return result;
   }

}
