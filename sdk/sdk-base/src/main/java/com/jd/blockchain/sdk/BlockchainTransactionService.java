package com.jd.blockchain.sdk;

import com.jd.blockchain.crypto.HashDigest;
import com.jd.blockchain.ledger.PreparedTransaction;
import com.jd.blockchain.ledger.TransactionContent;
import com.jd.blockchain.ledger.TransactionTemplate;

public interface BlockchainTransactionService {

	/**
	 * 发起新交易；
	 *
	 * @return
	 */
	TransactionTemplate newTransaction(HashDigest ledgerHash);

	/**
	 * 根据交易内容准备交易实例；
	 *
	 * @param content
	 * @return
	 */
	PreparedTransaction prepareTransaction(TransactionContent content);

//	/**
//	 * 以指定的科目和流水号发起新交易；
//	 *
//	 * @param subjectAccount
//	 *            交易的科目账户地址；
//	 * @param sequenceNumber
//	 *            交易的流水号；
//	 * @return
//	 */
//	TransactionTemplate newTransaction(ByteArray ledgerHash, String subjectAccount, long sequenceNumber);

}