public class SList {

    private SListIterator sListIterator=new SListIterator();
    public void insert(int data)
    {
        sListIterator.addData(data);
    }
    public void delete(int index)
    {
        sListIterator.deleteNode(index);
    }
    public void iterator()
    {
        sListIterator.displayList();
    }
}
