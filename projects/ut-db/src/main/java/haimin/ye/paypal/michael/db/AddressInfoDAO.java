package haimin.ye.paypal.michael.db;


import haimin.ye.paypal.michael.db.exception.FinderException;
import haimin.ye.paypal.michael.db.resource.DBAddressInfo;

import java.util.ArrayList;

import java.util.List;

/**
 * 
 * @author haiye this class is used to load address information from database
 * 
 */
public class AddressInfoDAO {

    private static AddressInfoDAO s_instance;

    public static synchronized AddressInfoDAO getInstance() {
        if (s_instance == null)
            s_instance = new AddressInfoDAO();
        return s_instance;
    }

    public List<?> getAddress(long userAccountNumber) throws FinderException {

        List<DBAddressInfo> events = new ArrayList<DBAddressInfo>();
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
