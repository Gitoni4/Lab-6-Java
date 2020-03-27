public interface ButtonListener
{
    public void undoAction();
    public void resetAction();
    public void saveAction();
    public void loadAction();
    public void exitAction();
}


//////    Am facut o interfata separata pentru actiunile facute in urma apasarii unui buton
/////     pentru a lasa componentele aplicatiei independete unele de celalte,
/////         pentru a scapa de posibile conflicte viitoare