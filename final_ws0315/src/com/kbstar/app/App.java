package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.Account;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Trsc;
import com.kbstar.frame.BankService;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;
import com.kbstar.service.BankServiceImpl;
import com.kbstar.service.CustCRUDServiceImple;
import com.kbstar.service.TrscCRUDServiceImpl;

public class App {

	public static void main(String[] args) {
		BankService<String, String, String> bankService = new BankServiceImpl();
		CRUDService<String, Cust> custService = new CustCRUDServiceImple();
		CRUDService<String, Account> accService = new AccountCRUDServiceImpl();
		CRUDService<String, Trsc> trscService = new TrscCRUDServiceImpl();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----   *KB Banking Program -----");
			System.out.println("Login(l) or Register(r) or Quit(q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				break;
			} else if (cmd.equals("r")) {
				System.out.println("Regiter ...");
				System.out.println("Input ID.. ");
				String id = sc.next();
				System.out.println("Input PWD.. ");
				String pwd = sc.next();
				System.out.println("Input NAME.. ");
				String name = sc.next();
				System.out.println("Input EMAIL.. ");
				String email = sc.next();
				System.out.println("Input CONTACT.. ");
				String contact = sc.next();
				Cust cust = new Cust(id, pwd, name, email, contact);
				try {
					custService.register(cust);
					System.out.println("환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

			else if (cmd.equals("l")) {
				System.out.println("Login.. ");
				System.out.println("ID를 입력 하세요.. ");
				String id = sc.next();
				System.out.println("PWD를 입력 하세요.. ");
				String pwd = sc.next();
				Cust cust = null;
				try {
					cust = bankService.login(id, pwd);
					System.out.println(cust);
					System.out.println("로그인 성공");
					System.out.println("-------------------");
					while (true) {
						System.out.println("Menu(m(makeAcc), t(transfer), i(accInfo) ...");
						System.out.println("tr(trscInfo), d(deposit), w(withdraw), z(개명), e(exit) ...");
						String cmn = sc.next();
						if (cmn.equals("e")) { // 다시 로그인 화면으로 돌아감
							break;
							// --------------------makeaccount
						} else if (cmn.equals("m")) {
							System.out.println("계좌 생성");
							System.out.println("잔액 입력...");
							Double balance = Double.parseDouble(sc.next());
							System.out.println("예금주 성명 입력...");
							String user_id = sc.next();
							Account acc = null;
							acc = new Account(null, balance, user_id);
							accService.register(acc);
							// --------------------transfer
						} else if (cmn.equals("t")) {
							System.out.println("Transfer ...");
							System.out.println("input myAcc, receiverAcc, amount, desc");
							try {
								String myAcc = sc.next();
								String receiverAcc = sc.next();
								double amount = sc.nextDouble();
								String desc = sc.next();
								bankService.transfer(myAcc, receiverAcc, amount, desc);
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							//--------------------accountInfo
						} else if(cmn.equals("i")) {
							System.out.println("고객님의 계좌 잔액을 보고 싶은 경우이군요.");
							System.out.println("고객님의 계좌번호를 입력하세요.");
							try {
								String yourAcc = sc.next();
								Account account = null;
								account = accService.get(yourAcc);
								System.out.println(account);
							}catch (Exception e) {
								System.out.println(e.getMessage());
							}
						}
							//--------------------trscInfo
						  else if (cmn.equals("tr")) {
							System.out.println("Select Transaction ...");
							System.out.println("input trscNum");
							try {
								String trscNum = sc.next();
								trscService.get(trscNum);
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							//--------------------deposit
						} else if (cmn.equals("d")) {
							System.out.println("Select deposit ...");
							System.out.println("input myAcc, money");
							try {
								String myAcc = sc.next();
								double money = sc.nextDouble();
								bankService.deposit(myAcc, money);
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							//--------------------withdraw
						} else if (cmn.equals("w")) {
							System.out.println("Select withdraw ...");
							System.out.println("input myAcc, money");
							try {
								String myAcc = sc.next();
								double money = sc.nextDouble();
								bankService.withdraw(myAcc, money);
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
						} else if(cmn.equals("z")) {
							try {
								System.out.println("개명을 하셨나요???");
								System.out.println("고객님의 계좌번호를 입력하세요.");
								String yourAcc = sc.next();
								System.out.println("새로운 이름을 입력해주세요.");
								String yourNewName = sc.next();
								Account account = accService.get(yourAcc);
								account = new Account(yourAcc, account.getBalance(), yourNewName);
								accService.modify(account);
							} catch (Exception e) {
								System.out.println(e.getMessage());
								return;
							}
							System.out.println("제신고 거래(개명처리)가 정상적으로 완료되었습니다.");
							System.out.println("i 를 눌러 다시 확인해보세요.");
							}
						
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}
		}

		sc.close();

	}

}