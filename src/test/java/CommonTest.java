import org.apache.axis.AxisFault;
import org.apache.axis.types.URI;
import org.csapi.www.schema.common.v2_0.PolicyException;
import org.csapi.www.schema.common.v2_0.ServiceException;
import org.csapi.www.schema.sms.MessageFormat;
import org.csapi.www.schema.sms.SendMethodType;
import org.csapi.www.schema.sms.SendSmsRequest;
import org.csapi.www.schema.sms.SendSmsResponse;
import org.csapi.www.service.Cmcc_mas_wbsSoapBindingStub;
import org.csapi.www.service.Cmcc_mas_wbs_ServiceLocator;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: yedong
 * @Date: 2020/2/21 0:46
 * @Modified by:
 */

public class CommonTest {
    @Test
    public void test() {
        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        sendSmsRequest.setApplicationID("P000000000000039");
        List<URI> list = new ArrayList();
        try {
            URI[] uris = new URI[1];
            uris[0] = new URI("tel:18914212013");

            sendSmsRequest.setDestinationAddresses(uris);

            sendSmsRequest.setMessageFormat(MessageFormat.GB2312);
            sendSmsRequest.setDeliveryResultRequest(true);
            sendSmsRequest.setSendMethod(SendMethodType.Normal);
            sendSmsRequest.setMessage("接口测试2021-4-26");


            Cmcc_mas_wbs_ServiceLocator cmcc_mas_wbs_serviceLocator = new Cmcc_mas_wbs_ServiceLocator();
            cmcc_mas_wbs_serviceLocator.getcmcc_mas_wbsAddress();


            Cmcc_mas_wbsSoapBindingStub cmcc_mas_wbsSoapBindingStub = new Cmcc_mas_wbsSoapBindingStub(new URL(cmcc_mas_wbs_serviceLocator.getcmcc_mas_wbsAddress()), new
                    org.apache.axis.client.Service());


            SendSmsResponse sendSmsResponse = cmcc_mas_wbsSoapBindingStub.sendSms(sendSmsRequest);


            System.out.println(sendSmsResponse.getRequestIdentifier());
        } catch (URI.MalformedURIException e) {
            e.printStackTrace();
        } catch (PolicyException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
