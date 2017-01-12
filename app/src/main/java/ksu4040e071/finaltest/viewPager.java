package ksu4040e071.finaltest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class viewPager extends AppCompatActivity {
    private List<Member> memberList;
    private ViewPager vpMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        List<Member> memberList = getMemberList();
        MemberAdapter memberAdapter = new MemberAdapter(getSupportFragmentManager(), memberList);
        vpMember = (ViewPager) findViewById(R.id.vpMember);
        vpMember.setAdapter(memberAdapter);
    }

    private List<Member> getMemberList() {
        memberList = new ArrayList<>();
        memberList.add(new Member(1, R.drawable.p01, "正妹"));
        memberList.add(new Member(2, R.drawable.p02, "Jack"));
        memberList.add(new Member(3, R.drawable.p03, "皮卡丘"));
        memberList.add(new Member(4, R.drawable.p04, "Malia"));
        memberList.add(new Member(5, R.drawable.p05, "柯P"));
        memberList.add(new Member(6, R.drawable.p06, "David"));
        memberList.add(new Member(7, R.drawable.p07, "國父"));
        memberList.add(new Member(8, R.drawable.p08, "Ron"));
        memberList.add(new Member(9, R.drawable.p09, "正妹"));
        memberList.add(new Member(10, R.drawable.p10, "也是正妹"));
        memberList.add(new Member(11, R.drawable.p11, "成熟正妹"));
        memberList.add(new Member(12, R.drawable.p12, "我"));
        return memberList;
    }

    private class MemberAdapter extends FragmentStatePagerAdapter {
        List<Member> memberList;

        private MemberAdapter(FragmentManager fm, List<Member> memberList) {
            super(fm);
            this.memberList = memberList;
        }

        @Override
        public int getCount() {
            return memberList.size();
        }

        @Override
        public Fragment getItem(int position) {
            return MemberFragment.newInstance(memberList.get(position));
        }
    }

    public void onFirstClick(View view) {
        vpMember.setCurrentItem(0);
    }

    public void onLastClick(View view) {
        vpMember.setCurrentItem(memberList.size() - 1);
    }
}
