package ordercancellationexample;

//based on states of order its code/logic will differ
public interface OrderState {

	void handleCancellation();
}
