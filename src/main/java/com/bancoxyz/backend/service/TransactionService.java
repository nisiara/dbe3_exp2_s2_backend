import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoxyz.backend.model.entity.Transaction;
import com.bancoxyz.backend.repository.TransactionRepository;

@Service
public class TransactionService {


  @Autowired
  private TransactionRepository transactionRepository;

  public TransactionService(TransactionRepository transactionRepository) {
      this.transactionRepository = transactionRepository;
  }

}
