package controller;

import domain.*;
import view.input.ConsoleInputView;
import view.input.InputView;
import view.input.dto.PurchaseInput;
import view.output.ConsoleOutputView;
import view.output.OutputView;
import view.output.dto.PurchaseOutput;

public class LottoSimulator {

    public void run() {
        InputView inputView = new ConsoleInputView();
        OutputView outputView = new ConsoleOutputView();

        PurchaseInput purchaseInput = inputView.inputPurchaseAmount();
        PurchaseAmount purchaseAmount = purchaseInput.toPurchaseAmount();
        PurchaseCountCalculator purchaseCountCalculator = new PurchaseCountCalculator(purchaseAmount);
        PurchaseCount purchaseCount = purchaseCountCalculator.calculate();
        PurchaseOutput purchaseOutput = purchaseCount.toPurchaseOutput();
        outputView.viewPurchaseAmount(purchaseOutput);

        LottosGenerator lottosGenerator = new LottosGenerator(purchaseCount);
        Lottos lottos = lottosGenerator.generate();



    }
}
