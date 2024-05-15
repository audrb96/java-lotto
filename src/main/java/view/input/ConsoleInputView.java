package view.input;

import exception.InvalidInputException;
import util.Console;
import util.StringUtils;
import view.input.dto.PurchaseInput;

import static exception.code.ErrorCode.*;

public class ConsoleInputView implements InputView{

    private static final String PURCHASE_AMOUNT_NAVIGATION = "구입금액을 입력해 주세요.";

    @Override
    public PurchaseInput inputPurchaseAmount() {
        System.out.println(PURCHASE_AMOUNT_NAVIGATION);
        String input = Console.readLine();
        this.validateNumber(input);

        return new PurchaseInput(Integer.parseInt(input));
    }

    @Override
    public void inputWinningNumbers() {

    }

    @Override
    public void inputBonusNumber() {

    }

    private void validateNumber(String input) {
        if(!StringUtils.isNumeric(input)) {
            throw new InvalidInputException(ONLY_NUMBER_INPUT, "숫자인 입력값만 허용됩니다.");
        }
    }
}
