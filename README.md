# LeetCode 101：和你一起你轻松刷题（C++）

一个面向有C++编程基础，但缺乏刷题经验的读者的教科书和工具书（不适合编程小白喔）。

永久免费，禁止任何盈利性利用，欢迎传阅和指正。为防止不被告知的二次修改，本书暂不放出Latex源代码。

* [图书链接](https://github.com/changgyhub/leetcode_101/blob/master/LeetCode%20101%20-%20A%20LeetCode%20Grinding%20Guide%20(C%2B%2B%20Version).pdf)
* [图书模板链接](https://www.overleaf.com/latex/templates/elegantbook-template/zpsrbmdsxrgy)

作者：高畅 Chang Gao

最新版本：1.12

## 思维导图

![overview](overview.png)

## Leetcode刷题记录

| 题号                                                         | 等级   | 日期       | 知识点                     | 备注                                                         | 上次复习时间 | 错题标记 |
| ------------------------------------------------------------ | ------ | ---------- | -------------------------- | ------------------------------------------------------------ | ------------ | -------- |
| 695. Max  Area of Island                                     | Easy   | 2021/10/8  | 深搜                       | 简单深搜即可                                                 | 2021/10/30   |          |
| 547.  Number of Provinces                                    | Medium | 2021/10/8  | 深搜                       | 简单深搜即可                                                 | 2021/10/30   |          |
| 417.  Pacific Atlantic Water Flow                            | Medium | 2021/10/8  | 深搜                       | 逆向思维，由低到高；复习Arrays.asList的使用                  | 2021/10/30   |          |
| 46.  Permutations                                            | Medium | 2021/10/10 | 深搜回溯                   | 没有重复数字的排列，较简单；注意remove(Integer.valueOf())小细节 | 2021/10/30   |          |
| 77.  Combinations                                            | Medium | 2021/10/11 | 深搜回溯                   | 没有重复数字的组合题，较简单，注意根据k剪枝，不用全遍历      | 2021/10/30   |          |
| 79. Word  Search                                             | Medium | 2021/10/12 | 深搜回溯                   | 深搜回溯返回布尔值                                           | 2021/10/30   |          |
| 51.  N-Queens                                                | Hard   | 2021/10/13 | 深搜回溯                   | 列、正斜线和反斜线各一个visit布尔数组，每次深搜找到下一行符合条件的点位；注意元素改动用char数组，输出结果再转String | 2021/10/30   | ⭕        |
| 257.  Binary Tree Paths                                      | Easy   | 2021/10/18 | 二叉树深搜回溯             | 注意何时记录path                                             | Not yet      |          |
| 47.  Permutations II                                         | Medium | 2021/10/18 | 深搜回溯                   | 注意有相同元素时深搜怎么防止[a1,a1',a2] [a1',a1,a2]同时计入结果 | Not yet      |          |
| 40.  Combination Sum II                                      | Medium | 2021/10/18 | 深搜回溯                   | 区别于上一个排列问题，这个是组合问题,根据题目要求处理重复元素方法稍有不同 | Not yet      |          |
| 37.  Sudoku Solver                                           | Hard   | 2021/10/19 | 深搜回溯                   | 是n-Queen的变种，区别在于下一次深搜的起点                    | Not yet      | ⭕        |
| 310.  Minimum Height Trees                                   | Medium | 2021/10/20 | 广度遍历/树                | 最小高度树的根节点最多有几个；怎么找到最小高度树的根节点     | 2021/10/23   |          |
| 70.  Climbing Stairs (Easy)                                  | Easy   | 2021/10/22 | 动态规划/斐波那契          | 注意何时动态规划能够压缩空间                                 | Not yet      |          |
| 198.  House Robber                                           | Medium | 2021/10/22 | 一维动态规划               | 先写出动态转移方程以及注意初始状态                           | Not yet      |          |
| 413.  Arithmetic Slices                                      | Medium | 2021/10/23 | 一维动态规划               | 和最大和子序列的搜索有点像                                   | Not yet      |          |
| 64.  Minimum Path Sum                                        | Medium | 2021/10/23 | 二维动态规划               | dp[i][j]=min(d[i][j-1],d[i-1][j])+grid[i][j]，注意处理特殊点，以及本题可以空间压缩，只需要记录一行的数据即可 | Not yet      |          |
| 542.  Matrix (Medium)                                        | Medium | 2021/10/28 | 二维动态规划               | 二维数组涉及四个方向的动态转移方程该如何遍历？分两次遍历     | Not yet      |          |
| 221.  Maximal Square                                         | Medium | 2021/10/29 | 二维动态规划               | dp数组的含义是该点为右下端点的正方形的最大边长；状态转移方程有点难；以及注意处理边界点 | Not yet      |          |
| 279.  Perfect Squares                                        | Medium | 2021/10/30 | 分割类动态规划             | 动态转移方程不是相邻元素的关系，依赖于分割条件               | Not yet      | ⭕        |
| 91.  Decode Ways                                             | Medium | 2021/10/31 | 分割类动态规划             | prev和now的数字不同动态转移方程不同                          | Not yet      |          |
| 139.  Word Break                                             | Medium | 2021/11/1  | 分割类动态规划             | dp[i]取决于dp[0]~dp[i-1]以及相应的子字符串                   | Not yet      |          |
| 300.  Longest Increasing Subsequence                         | Medium | 2021/11/2  | 分割类动态规划             | 此题可以用贪心和二分查找进行优化                             | Not yet      |          |
| 1143.  Longest Common Subsequence                            | Medium | 2021/11/3  | 分割类动态规划             | 二维数组作为dp数组；如何避免单独处理下标为0的情况；状态转移方程分两种情况 | 2021/12/16   | ⭕        |
| 416.  Partition Equal Subset Sum                             | Medium | 2021/11/4  | 0-1背包问题                | 初始状态；空间压缩；逆向遍历                                 | Not yet      | ⭕        |
| 322.  Coin Change                                            | Medium | 2021/11/5  | 完全背包问题               | dp[j]是凑成j的最少硬币数量，注意有多种凑法时，取较小值，以及注意处理-1的情况；空间压缩，内层正向遍历 | Not yet      |          |
| 474. Ones  and Zeroes                                        | Medium | 2021/11/6  | 0-1背包问题                | 背包体积约束条件有两个，dp数组多一个维度                     | Not yet      | ⭕        |
| 650. 2  Keys Keyboard                                        | Medium | 2021/11/7  | 字符串编辑                 | 转换成递归找最小因数                                         | 2021/12/17   | ⭕        |
| 53.  Maximum Subarray                                        | Easy   | 2021/11/8  | 动态规划；最大连续子序列和 | dp含义为当前元素为末尾的子序列最大和；可以空间压缩；另设一变量更新遍历过程中所有dp的最大值； | 2021/12/18   |          |
| 343.  Integer Break                                          | Medium | 2021/11/9  | 分割类动态规划             | 注意一个因为dp考虑的分割数字至少有两个，状态转移还要考虑1个数字的情况；同时还可以用数学方法简化。 | 2021/12/18   | ⭕        |
| 583.  Delete Operation for Two Strings                       | Medium | 2021/11/10 | 二维动态规划               | 看出是要求最长公共子序列就很常规了                           | Not yet      |          |
| 204. Count  Primes                                           | Easy   | 2021/12/6  | 质数                       | 按常规的一个个判断会超时，从奇数、开平方、倍数角度加快速度   | Not yet      | ⭕        |
| 241.  Different Ways to Add Parentheses                      | Medium | 2021/12/7  | 分治                       | 按操作符的位置进行分割dfs                                    | 2021/12/22   | ⭕        |
| No932.  Beautiful Array                                      | Medium | 2021/12/8  | 分治                       | 关键在于怎么把分解子问题，并利用奇偶性把子问题的结果线性增加合并为父问题的答案 | Not yet      | ⭕        |
| No312.  Burst Balloons                                       | Hard   | 2021/12/9  | 分治                       | 分治的依据是最后一个爆炸的元素为界，因为分治后的结果需要使用分治前的元素，所以需要构造比给定数组左右各多一个空位用于储存爆炸后左右位置的元素 | 2021/12/23   | ⭕        |
| 504.  Base 7                                                 | Easy   | 2021/12/10 | 数学                       | 简单进制转换                                                 | Not yet      |          |
| 172.  Factorial Trailing Zeroes                              | Medium | 2021/12/10 | 数学                       | n以下所有正整数某个特定质因数的个数求法                      | Not yet      |          |
| 415. Add  Strings                                            | Easy   | 2021/12/12 | 数学                       | 字符串逐位相加；int和char的转换方法                          | Not yet      | ⭕        |
| No188.  Best Time to Buy and Sell Stock IV                   | Hard   | 2021/12/14 | 股票交易                   | 分别用sell和buy两个数组表示第j次买入或者卖出的最大收益       | Not yet      | ⭕        |
| 309.  Best Time to Buy and Sell Stock with Cooldown          | Medium | 2021/12/15 | 股票交易(状态机）          | 涉及冷却时间的股票交易要用状态机                             | Not yet      | ⭕        |
| 714.  Best Time to Buy and Sell Stock with Transaction Fee   | Medium | 2021/12/16 | 股票交易(状态机）          | 带有交易费的股票交易，可以设置两个状态                       | Not yet      |          |
| No72.  Edit Distance                                         | Hard   | 2021/12/16 | 动态规划，字符串编辑       | 和1143类似的dp数组设置，注意初始值设置                       | 2021/1/10    | ⭕        |
| 451.  Sort Characters By Frequency                           | Medium | 2021/10/23 | 桶排序                     | Arrays.sort重写comparator方法；注意不能传入基本数据类型      | 2021/12/17   | ⭕        |
| 10.  Regular Expression Matching                             | Hard   | 2021/12/18 | 动态规划，字符串编辑       | 分类讨论，关键就是带星号的情况下，是否要重复，状态转移方程不同；注意等价dp[0][0]情况的初始化 | Not yet      | ⭕        |
| 494.  Target Sum                                             | Medium | 2021/12/19 | 动态规划，0-1背包          | 怎样确定dp数组大小，负数情况怎么对应到下标                   | Not yet      |          |
| 376.  Wiggle Subsequence                                     | Medium | 2021/12/21 | 动态规划，摇摆序列         | 纯dp，数组要根据末尾两元素单调性分类；可以用贪心优化到O(n)   | Not yet      | ⭕        |
| 326.  Power of Three                                         | Easy   | 2021/12/23 | 数学                       | 注意整数的范围                                               | Not yet      |          |
| 384.  Shuffle an Array                                       | Medium | 2021/12/24 | 数学，随机选取             | 注意本题考查洗牌算法，要求完全随机                           | Not yet      | ⭕        |
| 34. Find  First and Last Position of Element in Sorted Array | Medium | 2021/9/29  | 二分法                     | 二分法找元素当存在多个元素时如何定位最小index和最大index；   | 2021/12/24   |          |
| No528.  Random Pick with Weight                              | Medium | 2021/12/25 | 数学，带权重随机           | 利用前缀和实现带有权重的随机选取，注意random取随机数的范围   | Not yet      | ⭕        |
| 81.  Search in Rotated Sorted Array II                       | Medium | 2021/10/3  | 二分法                     | 当数组中存在两个递增序列时，怎么判断mid位于哪个递增序列中    | 2021/12/25   |          |
| 382.  Linked List Random Node                                | Medium | 2021/12/26 | 数学，水库算法             | 水库算法，在事先不知道数组大小的情况下遍历做到随机选取元素   | Not yet      | ⭕        |
| 154.  Find Minimum in Rotated Sorted Array II                | Hard   | 2021/10/1  | 二分法                     | rotate 数组找最值                                            | 2021/12/26   |          |
| 168.  Excel Sheet Column Title                               | Easy   | 2021/12/28 | 数学，进制转化             | 注意进制起始位的细节                                         | Not yet      |          |
| 67. Add  Binary                                              | Easy   | 2021/12/28 | 数学，字符串加法           | StringBuffer翻转函数；长度不同时按位相加的写法               | Not yet      |          |
| 540.  Single Element in a Sorted Array                       | Medium | 2021/10/1  | 二分法                     | 奇数长度数组，mid左右元素个数相同；通过mid和mid+1元素比较锁定单个元素位置在左边还是右边 | 2021/12/28   | √        |
| 238.  Product of Array Except Self                           | Medium | 2021/12/29 | 数学                       | 类似于分糖果的思路，从左到右遍历一遍，然后再从右往左遍历一遍，记录乘积product，先更新ans，再更新product | Not yet      |          |
| 135.  Candy                                                  | Hard   | 2021/9/3   | 贪心                       | 从左往右遍历使每个元素与相邻右元素满足要求；从右往左遍历使与相邻做元素满足要求 | 2021/12/29   |          |
| 462.  Minimum Moves to Equal Array Elements II               | Medium | 2021/12/30 | 数学                       | 类似找类似于求\|x-1\|+\|x-2\|+...+\|\|x-n\|的最小值          | Not yet      | ⭕        |
| 122.  Best Time to Buy and Sell Stock II                     | Medium | 2021/9/19  | 贪心，股票交易             | 没有交易费、冷却天数的股票交易，直接谷底买进，谷峰卖出即可   | 2021/12/30   |          |
| 4.  Median of Two Sorted Arrays                              | Hard   | 2021/10/2  | 二分法，合并数组           | 两个有序数组合并求中位数                                     | 2022/1/6     | ⭕        |
| 169.  Majority Element                                       | Easy   | 2022/1/5   | 数学                       | 怎样快速找到最多的元素                                       | Not yet      |          |
| 202.  Happy Number                                           | Easy   | 2022/1/8   | 数学                       | 类似快慢指针找环路可以把空间复杂度降到1                      | Not yet      |          |
| 470.  Implement Rand10() Using Rand7()                       | Easy   | 2022/1/8   | 数学                       | 用一个随机生成器生成一个更大范围的随机生成器                 | Not yet      | ⭕        |
| 342.  Power of Four                                          | Easy   | 2022/1/10  | 位运算                     | 判断2的次幂n&(n-1)==0,4的次幂就多加一个奇数位的条件          | Not yet      |          |
| 136.  Single Number                                          | Easy   | 2022/1/10  | 位运算                     | 用到了0^x=x,x^x=0的技巧                                      | Not yet      | ⭕        |
| 190.  Reverse Bits                                           | Easy   | 2022/1/10  | 位运算                     | 和1与获取末位然后结果移位后或运算                            | Not yet      |          |
| 318.  Maximum Product of Word Lengths                        | Medium | 2022/1/11  | 位运算                     | 用一个26位的二进制数字储存每个字符串中字母的出现情况         | Not yet      | ⭕        |
| 693.  Binary Number with Alternating Bits                    | Easy   | 2022/1/12  | 位运算                     | 想办法获取111…111和1000...000这两种数                        | 2022/1/13    |          |
| 476.  Number Complement                                      | Easy   | 2022/1/13  | 位运算                     | 190的变种题，获取末位元素后和1异或                           | Not yet      |          |
| 260.  Single Number III                                      | Medium | 2022/1/13  | 位运算                     | 136的升级版，需要思考怎么把数组分为两部分，两个单个数分开，然后两部分分别异或 | Not yet      | ⭕        |
| 448.  Find All Numbers Disappeared in an Array               | Easy   | 2022/1/14  | 数组                       | 简单两次遍历数组即可                                         | Not yet      |          |
| 48.  Rotate Image                                            | Medium | 2022/1/14  | 数组旋转                   | 数组原地旋转，注意旋转后的坐标关系，以及不要重复旋转         | Not yet      |          |
| 240.  Search a 2D Matrix II                                  | Medium | 2022/1/15  | 数组，寻找元素             | 在行、列有序的二维数组中寻找元素的技巧                       | Not yet      |          |
| 769. Max  Chunks To Make Sorted                              | Medium | 2022/1/16  | 数组                       | 题目等价于找到最小的k使得A[:k+1]包含0~k的所有元素            | Not yet      |          |
| 232.  Implement Queue using Stacks                           | Easy   | 2022/1/17  | 栈                         | 经典用两个栈来实现先入先出队列                               | Not yet      |          |
| 155. Min  Stack                                              | Easy   | 2022/1/18  | 栈                         | 在常数时间复杂度获取栈的最小值                               | Not yet      | ⭕        |
| 20.  Valid Parentheses                                       | Easy   | 2022/1/19  | 栈，括号匹配               | 除了匹配以外，不要遗漏括号多余的情况                         | Not yet      |          |
| 739.  Daily Temperatures                                     | Medium | 2022/1/20  | 单调栈                     | 按温度递减顺序，将入栈顺序压栈，出栈时序号之差即为等待天数   | Not yet      | ⭕        |
| 23.  Merge k Sorted Lists                                    | Hard   | 2022/1/21  | 优先队列                   | 将所有的list的节点加入优先队列，每次取出的值就是最小值，这样就达到了排序的效果 | Not yet      | ⭕        |
| 218. The  Skyline Problem                                    |        | 2022/1/22  | 优先队列                   | 找到所有高度变化的第一个点，按节点的顺序加入或弹出优先队列，若所有节点中的最大高度变化了说明加入起始节点或者弹出末尾节点后是转折点 | Not yet      | ⭕        |
| 239.  Sliding Window Maximum                                 | Hard   | 2022/1/23  | 双端队列                   | 单调栈的变种题，注意入队的是数组下标                         | Not yet      | ⭕        |
| 1. Two  Sum                                                  | Easy   | 2022/1/24  | 哈希                       | 遍历到num时查看target-num的哈希是否存在                      | Not yet      |          |
| 128.  Longest Consecutive Sequence                           | Medium | 2022/1/24  | 哈希                       | 放入set后向左向右遍历的同时删除元素                          | Not yet      |          |
| 149. Max  Points on a Line                                   | Hard   | 2022/1/26  | 哈希                       | 注意相同点和斜率不存在的情况                                 | Not yet      | ⭕        |
| 332.  Reconstruct Itinerary                                  | Hard   | 2022/1/27  | 哈希，栈                   | 用哈希记录站点之间的关系（一对多），用栈来依次弹出最后一个站点，注意一对多的关系入栈按字母序 | Not yet      | ⭕        |
| 303.  Range Sum Query - Immutable                            | Easy   | 2022/1/28  | 数组，前缀和               | 利用前缀和数组来计算固定区间的子序列之和                     | Not yet      |          |
| 304.  Range Sum Query 2D - Immutable                         | Medium | 2022/1/28  | 积分和，动态规划           | 是算矩形形区域元素和的动态规划变种，由一点确定矩形变为两点确定矩形 | Not yet      | ⭕        |
| 560.  Subarray Sum Equals K                                  | Medium | 2022/1/28  | 哈希，动态规划，前缀和     | 记录前缀和为psum的情况，每次计算新的psum，检查psum-k的哈希值更新当前满足k的子序列个数 | Not yet      |          |
| 566.  Reshape the Matrix                                     | Easy   | 2022/1/29  | 数组                       | 注意换行部分的细节即可                                       | Not yet      |          |
| 225.  Implement Stack using Queues                           | Easy   | 2022/1/29  | 队列，栈                   | 利用队列实现栈，主要就是元素在两个队列之间流动               | Not yet      |          |
| 503.  Next Greater Element II                                | Medium | 2022/1/29  | 单调栈                     | 739的变种，由于是循环数组，整个数组需要循环两遍              | Not yet      |          |
| 217.  Contains Duplicate                                     | Easy   | 2022/1/30  | 哈希                       | 简单用set查重即可                                            | Not yet      |          |
| 697.  Degree of an Array                                     | Easy   | 2022/1/30  | 哈希                       | hash需要记录两个数据，一个是出现的次数，一个是序列的长度     | Not yet      |          |
| 594.  Longest Harmonious Subsequence                         | Easy   | 2022/1/30  | 哈希                       | 关键就是最后的序列里面只有相邻的两个值                       | Not yet      | ⭕        |
