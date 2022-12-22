public class Forest {

    Tree[][] _trees;

    Forest ( int _length, int _width ) {

        _trees = new Tree[_length][_width];

            for (int i = 0; i < _length; i++)
            {
                Tree _newTree = new Tree();
                _trees[i][0] = _newTree;
                for (int x = 0; x < _width; x++)
                {
                    Tree _newTree2 = new Tree();
                    _trees[i][x] = _newTree2;
                }
            }
    }

    public void _cutDownTree(int _line, int _column)
    {
        _trees[_line][_column]._cutDownTree();
    }

    public int _getWidth()
    {
        return _trees[0].length;
    }

    public int _getLength()
    {
        return _trees.length;
    }

    public void _cutDownRow(int _row, boolean _horizontal)
    {
        if ( _horizontal )
        {
            for ( Tree _tempTree : _trees[_row] )
            {
                _tempTree._cutDownTree();
            }
        }
        else
        {
            for ( int i = 0 ; i < _trees.length ; i++)
            {
                _trees[i][_row]._cutDownTree();
            }
        }
    }

    public String _toString()
    {
        String _output = "";

        for ( Tree[] _treeList : _trees )
        {
            _output += "\n";

            for ( Tree _tree : _treeList )
            {

                _output += _tree._toString();
            }
        }

        return  _output;
    }

    public static void main(String[] args)
    {
    Forest _testForest = new Forest(10,10);
    _testForest._cutDownRow(4,false);
    _testForest._cutDownRow(4,true);

    System.out.println(_testForest._toString());
    }
}
