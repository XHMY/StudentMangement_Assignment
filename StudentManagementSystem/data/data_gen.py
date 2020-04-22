from cyaron import *

stu_num = []
uni_name = []

# 随机生成学生数据
test_data = IO("stu.csv")
test_data.input_writeln("num,name,sex,clas,prof,colle,tel,wechat,year,dorm")
for i in range(1000):
    num = randint(10000000, 99999999)
    stu_num.append(num)
    name = String.random(3, charset="赵钱孙李周吴郑王冯陈褚卫蒋伟秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑筠柔竹霭凝晓欢霄枫芸菲寒欣滢伊亚宜可姬舒影荔枝思丽秀飘育馥琦晶妍茜秋刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤滕殷罗毕郝邬安常乐于时傅皮卞齐康伍余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧")
    sex = String.random(None, charset=["男", "女"])
    clas = randint(1, 19)
    prof = String.random(None, charset=['电气工程及其自动化', '自动化', '电子信息工程', '通信工程', '计算机科学与技术', '电子科学与技术', '生物医学工程', '电气工程与自动化', '信息工程', '光源与照明', '软件工程',
                                        '影视艺术技术', '网络工程', '信息显示与光电技术', '集成电路设计与集成系统', '光电信息工程', '天文学类天文学', '地质学类地质学', '地球化学', '地理科学类地理科学', '资源环境与城乡规划管理', '地理信息系统', '地理信息科学与技术'])
    colle = String.random(None, charset=[
                          '杨振宁理学院', '李政道学院', '挖掘机研究所', '新东方培训学校', '篮翔智能研究院', '新东方厨师学校', '中国科学院'])
    tel = randint(10000000000, 99999999999)
    wechat = String.random(5)
    year = randint(2000, 2020)
    dorm = String.random(3, charset="123456789abc")
    stu = str(num) + ","+name + ","+sex + ","+str(clas) + ","+prof + "," + \
        colle + ","+str(tel) + ","+wechat + ","+str(year) + ","+dorm
    test_data.input_writeln(stu)

# 随机生成课程表
test_data = IO("cour.csv")
test_data.input_writeln("stu_num,name,pos,clasroom,week,day,time")
for num in stu_num:
    for cl in range(30):
        test_data.input_write(str(num), separator=",")
        test_data.input_write(String.random(5), separator=",")
        test_data.input_write(String.random(1), separator=",")
        test_data.input_write(str(randint(100, 999)), separator=",")
        test_data.input_write(str(randint(0, 1)), separator=",")
        test_data.input_write(str(randint(0, 6)), separator=",")
        test_data.input_writeln(str(randint(0, 5)), separator=",")

# 随机生成社团列表
test_data = IO("uni.csv")
test_data.input_writeln("uniName,from,type")
for i in range(30):
    un = String.random(5)
    uni_name.append(un)
    test_data.input_write(un, separator=",")
    test_data.input_write(","+String.random(7) + "学院", separator="")
    test_data.input_writeln(String.random(
        None, charset=['学术', '娱乐', '无聊', '竞赛', '政治', '游戏', '阅读', '语言']), separator=",")

# 随机生成社团成员列表
test_data = IO("unimem.csv")
test_data.input_writeln("uni_name,stu_num,join_date,level")
for un in uni_name:
    for i in range(200):
        test_data.input_write(un, separator=",")
        test_data.input_write(choice(stu_num), separator=",")
        date = str(randint(2000, 2020))+"/0" + \
            str(randint(1, 9))+"/"+str(randint(10, 28))
        test_data.input_write(date, separator=",")
        test_data.input_writeln(String.random(
            None, charset=['社长', '部长', '副社长', '副部长', '元老', '成员']), separator=",")
