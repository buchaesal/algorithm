package programmers.kakao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class 가장많이받은선물 {

    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        new 가장많이받은선물().solution(friends, gifts);
    }
    public int solution(String[] friends, String[] gifts) {

        Map<String, GiftHistory> historyMap = new HashMap<>();
        for (String gift : gifts) {
            String[] names = gift.split(" ");
            saveHistory(names[0], names[1], historyMap);
        }

        Map<String, Integer> resultMap = new HashMap<>();
        for (String friend : friends) {
            GiftHistory history = historyMap.getOrDefault(friend, new GiftHistory());
            for (String targetFriend : friends) {
                if (friend.equals(targetFriend)) {
                    continue;
                }
                GiftHistory receiverHistory = historyMap.getOrDefault(targetFriend, new GiftHistory());
                int sentMinusReceive = history.getSentCount(targetFriend) - receiverHistory.getSentCount(friend);
                if (sentMinusReceive > 0 || (sentMinusReceive == 0 && history.getScore() > receiverHistory.getScore())) {
                    resultMap.put(friend, resultMap.getOrDefault(friend, 0) + 1);
                }
            }
        }

        return resultMap.values().stream().mapToInt(i->i).max().orElse(0);
    }

    public void saveHistory(String sender, String receiver, Map<String, GiftHistory> historyMap) {
        GiftHistory senderHistory = historyMap.getOrDefault(sender, new GiftHistory());
        senderHistory.addSendHistory(receiver);
        historyMap.put(sender, senderHistory);
        GiftHistory receiverHistory = historyMap.getOrDefault(receiver, new GiftHistory());
        receiverHistory.addReceiveHistory();
        historyMap.put(receiver, receiverHistory);
    }

}

class GiftHistory {
    private Map<String, Integer> receivers = new HashMap<>();
    private int sendCount;
    private int receiveCount;
    private int score;

    public GiftHistory() {
    }

    public void addSendHistory(String receiver) {
        this.sendCount++;
        this.receivers.put(receiver, this.receivers.getOrDefault(receiver, 0) + 1);
    }

    public void addReceiveHistory() {
        this.receiveCount++;
    }

    public int getScore() {
        return this.sendCount - this.receiveCount;
    }

    public int getSentCount(String receiver) {
        return Optional.ofNullable(this.receivers.get(receiver)).orElse(0);
    }

}
