/** COPYRIGHT (C) ABC INDIA PVT.LTD.
 * 
 * ALL RIGHTS RESERVED BY ABC INDIA PVT.LTD., THIS PROGRAM
 * MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
 * FURNISHED BY ABC INDIA PVT.LTD., NO PART OF THIS PROGRAM
 * MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
 * WITHOUT THE PRIOR WRITTEN PERMISSION OF ABC INDIA PVT.LTD..
 * 
 * ABC INDIA PVT.LTD. CONFIDENTIAL AND PROPRIETARY
 */
package com.springbatch.step;

import org.springframework.batch.item.ItemProcessor;

/**
 * The Class Processor.
 */
public class Processor implements ItemProcessor<String, String> {

	/**
	 * Process.
	 *
	 * @param data the data
	 * @return the string
	 * @throws Exception the exception
	 */
	@Override
	public String process(String data) throws Exception {
		return data.toUpperCase();
	}

}
