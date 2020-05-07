import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class MyPro implements Processor{

	static Logger log = Logger.getLogger(MyPro.class.getName());
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("<XML>\n<MessageType>0</MessageType>\n<ProcCode>RCANQ</ProcCode>\n<STAN>20170829133727682</STAN>\n<LocalTxnDtTime>20170829133727682</LocalTxnDtTime>\n<DeliveryChannelCtrlID>CIB</DeliveryChannelCtrlID>\n<BranchNum>4999</BranchNum>\n<UserID>BTNI</UserID>\n<AccNum>4580581442001</AccNum>\n</XML>");
		//throw new RuntimeException("throwing Exception");
	}

}
