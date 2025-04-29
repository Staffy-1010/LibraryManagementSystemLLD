import java.util.ArrayList;
import java.util.List;

public class MemberController {
    List<Member> members;

    public MemberController() {
        this.members = new ArrayList<>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println("successfully added member");
    }

    public void removeMember(Member member){
        members.remove(member);
    }

    public Member getMember(String memberID) {
        for(Member member:members){
            if(member.getMemberID().equals(memberID)){
                return member;
            }
        }
        throw new MemberNotFoundException();
    }
}
