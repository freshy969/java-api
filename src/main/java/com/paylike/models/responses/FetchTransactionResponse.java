package com.paylike.models.responses;

import com.paylike.models.Transaction;

/**
 * Created by jankjr on 17/11/2016.
 */
public class FetchTransactionResponse {
  public Transaction transaction;

  @Override
  public String toString() {
    return "FetchTransactionResponse{" +
    "transaction=" + transaction +
    '}';
  }
}
