
public class TicTacToePiece  extends Piece
{
   private boolean isX;
public TicTacToePiece(boolean isX, String name)
{
   super(name);
   this.isX = isX;
}
public String getInfo() {
   return "" + isX;
}
}
