package haimin.ye.paypal.michael.rest.client;

import haimin.ye.paypal.michael.rest.client.resource.Transaction;

import java.math.BigInteger;

import org.apache.cxf.jaxrs.client.WebClient;

public class TransactionClientHandler {
    private static final String ENDPOINT = "/v1/wallet/card-accounts/";

    // private static JacksonJaxbJsonProvider jsonProvider = new
    // JacksonJaxbJsonProvider();

    public WebClient getWebClient() {
        /*
         * Properties prop =
         * JAXRSClientUtils.getClientProperties("fimanagementservclient",
         * AppConfigurationManager.getInstance());
         * logger.debug("trying to init fimanagementservclient"); try { return
         * RestClientFactory
         * .createWebClientFromProperties("fimanagementservclient", prop,
         * Collections.singletonList(jsonProvider)); } catch (Exception e) {
         * logger.debug("failed to init fimanagementservclient "); throw new
         * ACHReturnServiceException
         * ("Unable to connect to fimanagementservclient", e); }
         */
        return null;
    }

    public Transaction getTransactionsById(BigInteger accountNumber) throws Exception {
        WebClient client = getWebClient();

        StringBuffer url = new StringBuffer();
        url.append(ENDPOINT).append("CC").append(accountNumber);

        client.path(url.toString());
        /*
         * get credit card info
         * 
         * return RestResponseParser.fetchEntity(client, CardAccount.class);
         */

        return new Transaction();
    }

}
