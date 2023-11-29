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

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * The Class Writer.
 */
public class Writer implements ItemWriter<String> {

	/**
	 * Write.
	 *
	 * @param messages the messages
	 * @throws Exception the exception
	 */
	@Override
	public void write(List<? extends String> messages) throws Exception {
		for (String msg : messages) {
			System.out.println("Writing the data " + msg);
		}
	}

}