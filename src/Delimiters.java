import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        /* to be implemented in part (a) */
        ArrayList<String> returnList = new ArrayList<String>();
        for (String str : tokens){
            if (str.equals(openDel) || str.equals(closeDel)){
                returnList.add(str);
            }
        }
        return returnList;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        /* to be implemented in part (b) */
        int numO = 0;
        int numC = 0;
        for (String str: delimiters){
            if (str.equals(openDel)){
                numO ++;
            } else if ( str.equals(closeDel)){
                numC ++;
            }
            if (numC > numO){
                return false;
            }
        }
        if (numC != numO){
            return false;
        }
        return true;
    }
}