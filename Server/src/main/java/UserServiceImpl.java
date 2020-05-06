public class UserServiceImpl implements UserService {
    public float getNetSalary(User user) {
        return user.getSalary()+user.getBonus()-user.getDeduction();
    }
}
