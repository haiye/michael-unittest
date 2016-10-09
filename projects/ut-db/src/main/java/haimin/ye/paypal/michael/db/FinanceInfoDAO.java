package haimin.ye.paypal.michael.db;



import haimin.ye.paypal.michael.db.exception.FinderException;
import haimin.ye.paypal.michael.db.resource.DBFinanceInfo;

import java.util.ArrayList;

import java.util.List;

/**
 * 
 * @author haiye this class is used to load finance information, like Credit
 *         Card and Bank info from database
 * 
 */
public class FinanceInfoDAO {

    private static FinanceInfoDAO s_instance;

    public static synchronized FinanceInfoDAO getInstance() {
        if (s_instance == null)
            s_instance = new FinanceInfoDAO();
        return s_instance;
    }

    public List<DBFinanceInfo> getAddress(long userAccountNumber) throws FinderException {

        List<DBFinanceInfo> events = new ArrayList<DBFinanceInfo>();
        /*
         * QueryEngine qe = new QueryEngine(); TxnEventSenderCodeGenDoImpl
         * protoDo = new TxnEventSenderCodeGenDoImpl();
         * 
         * protoDo.setAccountNumber(userId);
         * protoDo.setDateEventRecorded(timeLimit);
         * protoDo.setTimeEventPublished(timeLimit.getTime()/1000);
         * 
         * qe.setAllowMultiThreadedQueries(true); qe.setPeformFullScan(true);
         * qe.readMultiple(events, protoDo.getMap(), protoDo,
         * FIND_BY_ACCOUNT_PIT_LIMIT, ReadSets.FULL.value, m_ourDDRHints);
         */
        /*
         * add implement code to load data from address domain DB
         */

        return events;
    }

}
