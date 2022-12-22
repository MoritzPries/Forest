public class Tree {

    private boolean _cutDown = false;

    public void _cutDownTree ()
    {
        this._cutDown = true;
    }

    public String _toString()
    {
        if (_cutDown) { return "o"; }
        else { return "x"; }
    }

}
